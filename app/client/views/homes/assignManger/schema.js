import SimpleSchema from "simpl-schema";
SimpleSchema.extendOptions(["autoform"]);

AutoForm.addInputType("managerSelectFormTemplate", {
  template: "managerSelectFormTemplate",
  valueIsArray: true,
  valueOut() {
    return this.val();
  }
});
const assignManagerSchema = function(groupId, idsToFilter) {
  return new SimpleSchema({
    groupId: {
      type: String,
      optional: false,
      autoform: {
        value: groupId,
        type: "hidden",
        label: false
      }
    },
    users: {
      type: Array,
      optional: false,
      autoform: {
        type: "managerSelectFormTemplate",
        options: () => getAssignManagerSchemaUsers(idsToFilter)
      }
    },
    "users.$": {
      type: String
    }
  });
};

export default assignManagerSchema;

function getAssignManagerSchemaUsers(idsToFilter) {
  const users = Meteor.users
    .find()
    .fetch()
    .filter(user => idsToFilter.indexOf(user._id) === -1)
    .map(user => {
      let address = "Unknown";
      if (user.emails.length > 0) {
        address = user.emails[0].address || "Unknown";
      }
      return {
        label: address,
        value: user._id
      };
    });

  return users;
}

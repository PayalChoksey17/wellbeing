Template.newActivity.created = function () {
  this.subscribe('allCurrentResidents');
  this.subscribe('allHomes');
  this.subscribe('allActivityTypes');
};

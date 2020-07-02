var exec = require('cordova/exec');
var FiveStarsPlugin = {
	overlayAppStore : function (arg0, success, error) {
    exec(success, error, 'FiveStarsPlugin', 'overlayAppStore', [arg0]);
	}	
}




cordova.addConstructor(function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.cordova.plugins.FiveStarsPlugin = FiveStarsPlugin;
  return window.cordova.plugins.FiveStarsPlugin;
});
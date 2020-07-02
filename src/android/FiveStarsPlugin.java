package cl.entel.plugin.fivestarsplugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Intent;
import android.net.Uri;
import android.content.pm.PackageManager;
import java.util.List;
import android.content.Context;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;
/**
 * This class echoes a string called from JavaScript.
 */
public class FiveStarsPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if("overlayAppStore".equals(action)){
            try {
                PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
                callbackContext.sendPluginResult(pluginResult);
                    return true;
                
            } catch (Exception e){
                callbackContext.error("Error ejecutando action: " + e);
                return false;
            }
        }
        callbackContext.error("No existe método: " + action);
        return false;
    }

    private void overlayAppStore(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Se esperaba no string no vacio");
        }
    }
}
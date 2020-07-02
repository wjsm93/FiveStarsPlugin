import StoreKit
@objc(FiveStarsPlugin) class FiveStarsPlugin : CDVPlugin {
    @objc(overlayAppStore:)
    func overlayAppStore(command: CDVInvokedUrlCommand) {

        // Error de plugin
        var pluginResult = CDVPluginResult(
        status: CDVCommandStatus_ERROR
        )

        if #available(iOS 10.3,*){
            SKStoreReviewController.requestReview()
            // Success de plugin
            pluginResult = CDVPluginResult(
                status: CDVCommandStatus_OK,
                messageAs: "Ok"
            )
            
        }
        // Enviar respuesta de plugin
        self.commandDelegate!.send(
        pluginResult,
        callbackId: command.callbackId
        )
    }
}

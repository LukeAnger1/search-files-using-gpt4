public interface android.support.customtabs.ICustomTabsCallback extends android.os.IInterface {
  public abstract void extraCallback(java.lang.String, android.os.Bundle) throws android.os.RemoteException;

  public abstract android.os.Bundle extraCallbackWithResult(java.lang.String, android.os.Bundle) throws android.os.RemoteException;

  public abstract void onMessageChannelReady(android.os.Bundle) throws android.os.RemoteException;

  public abstract void onNavigationEvent(int, android.os.Bundle) throws android.os.RemoteException;

  public abstract void onPostMessage(java.lang.String, android.os.Bundle) throws android.os.RemoteException;

  public abstract void onRelationshipValidationResult(int, android.net.Uri, boolean, android.os.Bundle) throws android.os.RemoteException;
}

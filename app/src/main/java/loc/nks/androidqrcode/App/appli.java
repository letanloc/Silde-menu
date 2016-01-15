package loc.nks.androidqrcode.App;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by loc on 15/01/2016.
 */
public class appli extends Application {

    Realm data;

    @Override
    public void onCreate() {
        super.onCreate();
        data = Realm.getInstance(this);

    }
}

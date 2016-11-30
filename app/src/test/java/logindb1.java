import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by John on 11/30/2016.
 */

public class logindb1 {
    public static final String Create_login_table =
            "CREATE TABLE user (_id INTEGER PRIMARY KEY AUTOINCREMEMNT, username TEXT, password TEXT, score INTEGER)";

    public static final String drop_login_table =
            "DROP TABLE IF EXISTS user";

    private static class DBhelper extends SQLiteOpenHelper {

    }
}

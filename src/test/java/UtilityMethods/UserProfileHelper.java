package UtilityMethods;

import org.ini4j.Wini;

import java.io.File;

public class UserProfileHelper {
    public String userIniFile(String userKey, String fieldKey) throws Exception {
        Wini ini = new Wini(new File("src/test/resources/testdata/userProfile/user.ini"));
        return ini.get(userKey.toString().replace("\"",""), fieldKey);
    }

    public String getValue(String userKey, String fieldkey) throws Exception {
        return userIniFile(userKey, fieldkey);
    }
}

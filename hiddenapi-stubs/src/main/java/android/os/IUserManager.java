package android.os;

import android.content.pm.UserInfo;

import androidx.annotation.RequiresApi;

import java.util.List;

public interface IUserManager extends IInterface {

    int getProfileParentId(int userId) throws RemoteException;

    @RequiresApi(26)
    boolean isUserUnlocked(int userId)
            throws RemoteException;

    List<UserInfo> getUsers(boolean excludeDying)
            throws RemoteException;

    List<UserInfo> getUsers(boolean excludePartial, boolean excludeDying, boolean excludePreCreated)
            throws RemoteException;

    abstract class Stub extends Binder implements IUserManager {

        public static IUserManager asInterface(IBinder obj) {
            throw new RuntimeException("STUB");
        }
    }
}

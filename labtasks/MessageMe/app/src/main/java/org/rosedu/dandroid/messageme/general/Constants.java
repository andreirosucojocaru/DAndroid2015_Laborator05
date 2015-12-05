package org.rosedu.dandroid.messageme.general;

public interface Constants {
    public final static int REGISTER_ACTIVITY_REQUEST_CODE = 1;
    public final static String REGISTER_ACTIVITY_INTENT_ACTION = "org.rosedu.android.intent.action.RegisterActivity";

    public final static String DATE_AND_TIME_INTENT_ACTION = "org.rosedu.dandroid.dateandtime.intent.action.DateAndTimeActivity";
    public final static String DATE_AND_TIME_BROADCAST_RECEIVER_ACTION = "org.rosedu.dandroid.dateandtime.broadcastreceiver.action.DateAndTimeActivity";
    public final static String DATE_AND_TIME_URI_ACTION = "dateandtimeprotocol://dandroid.rosedu.org/";

    public final static String USERNAME = "username";
    public final static String PASSWORD = "password";

    public final static int FRAGMENT_PROFILE_INDEX = 0;
    public final static String FRAGMENT_PROFILE = "Profile";
    public final static int FRAGMENT_MESSAGES_INDEX = 1;
    public final static String FRAGMENT_MESSAGES = "Messages";
    public final static int FRAGMENT_CONTACTS_INDEX = 2;
    public final static String FRAGMENT_CONTACTS = "Contacts";
    public final static int NUMBER_OF_FRAGMENTS = 3;

    public final static String TAG = "[MESSAGE_ME] ";
    public final static String IS_CONNECTED = "IS_CONNECTED: ";
    public final static String IS_WIFI = "IS_WIFI: ";
}

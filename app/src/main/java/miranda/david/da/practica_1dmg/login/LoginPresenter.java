package miranda.david.da.practica_1dmg.login;

import miranda.david.da.practica_1dmg.login.events.LoginEvent;

interface LoginPresenter {

    void login (String email, String password);
    void onStart();
    void onStop();
    void onEventLoginThread(LoginEvent event);
}

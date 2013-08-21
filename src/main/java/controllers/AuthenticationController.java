package controllers;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
import models.GuestbookEntry;
import models.User;
import ninja.Result;
import ninja.Results;
import ninja.Router;
import ninja.i18n.Lang;

import javax.persistence.EntityManager;

public class AuthenticationController {

    @Inject
    public org.slf4j.Logger logger;

    @Inject
    Router router;

    @Inject
    Lang lang;

    @Inject
    Provider<EntityManager> entitiyManagerProvider;

    @Transactional
    public Result getLogin() {
        String postRoute = router.getReverseRoute(AuthenticationController.class, "postLogin");
        return Results.html().render("postRoute", postRoute);
    }

    @Transactional
    public Result postLogin(User user) {

        logger.info("In postRoute");
        logger.debug(user.getEmail());
        logger.debug(user.getPassword());
        logger.debug(user.getPassword());




        return Results.redirect(router.getReverseRoute(AuthenticationController.class, "getLogin"));

    }
}

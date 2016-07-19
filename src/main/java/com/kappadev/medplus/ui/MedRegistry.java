package com.kappadev.medplus.ui;

import com.kappadev.medplus.data.emailProvider.EmailProviderNameEnum;
import com.kappadev.medplus.ui.profile.SelectProfilePopUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tomasz
 */
@Component
public class MedRegistry implements CommandLineRunner {

    @Autowired
    private SelectProfilePopUp selectProfilePopUp;

    @Override
    public void run(String... strings) throws Exception {
        selectProfilePopUp.initSelectProfilePopUp();
        selectProfilePopUp.setVisible(true);
    }

}

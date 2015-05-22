package com.kappadev.medplus.data.migration;

/**
 *
 * @author chlast
 */
public class MigrationToolsImpl implements MigrationTools {

    private static final String USER_HOME_CONSTANT = "user.home";

    @Override
    public boolean importData() {
        return false;
    }

    @Override
    public boolean exportData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void basicImport() {

    }
}

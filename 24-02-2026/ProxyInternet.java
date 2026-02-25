/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyDesignPattern;

/**
 *
 * @author Administrator
 */
class ProxyInternet implements Internet {

    private RealInternet realInternet = new RealInternet();

    @Override
    public void connectTo(String website) {

        if (isBlocked(website)) {
            System.out.println("Access Denied to " + website);
        } else {
            realInternet.connectTo(website);
        }
    }

        private boolean isBlocked(String website) {

        String[] blockedSites = {
            "facebook.com",
            "youtube.com",
            "instagram.com"
        };

        for (String site : blockedSites) {
            if (site.equalsIgnoreCase(website)) {
                return true;
            }
        }
        return false;
    }
}


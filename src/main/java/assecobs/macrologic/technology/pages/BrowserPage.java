package assecobs.macrologic.technology.pages;

import java.awt.*;
import java.awt.event.KeyEvent;


public class BrowserPage {

    public static void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void enterCTRLandF() throws AWTException {

        Robot rb = new Robot();

        for (int i = KeyEvent.VK_A; i <= KeyEvent.VK_Z; i++) {
            //User Press Alt
            rb.keyPress(KeyEvent.VK_ALT);
            //User Press letter
            rb.keyPress(i);

            //User release Alt + Letter
            rb.keyRelease(KeyEvent.VK_ALT);
            rb.keyRelease(i);

            System.out.println("Selenium ALT + " + (char)i);
            pause();
        }

        for (int i = KeyEvent.VK_A; i <= KeyEvent.VK_Z; i++) {
            switch (i) {
                case KeyEvent.VK_N :
                case KeyEvent.VK_T :
                case KeyEvent.VK_W :
                    continue;
                default:
                    break;
            }

            //User Press Alt
            rb.keyPress(KeyEvent.VK_CONTROL);
            //User Press letter
            rb.keyPress(i);

            //User release Alt + Letter
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(i);

            System.out.println("Selenium pressed CTRL + " + (char)i);
            pause();
        }

        for (int i = KeyEvent.VK_0; i <= KeyEvent.VK_9; i++) {
            //User Press Alt
            rb.keyPress(KeyEvent.VK_ALT);
            //User Press letter
            rb.keyPress(i);

            //User release Alt + Letter
            rb.keyRelease(KeyEvent.VK_ALT);
            rb.keyRelease(i);

            System.out.println("Selenium ALT + " + (char)i);
            pause();
        }


        for (int i = KeyEvent.VK_0; i <= KeyEvent.VK_9; i++) {
            //User Press Alt
            rb.keyPress(KeyEvent.VK_CONTROL);
            //User Press letter
            rb.keyPress(i);

            //User release Alt + Letter
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(i);

            System.out.println("Selenium ALT + " + (char)i);
            pause();
        }
    }
}

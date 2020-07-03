run with `./gradlew shell --console plain`

Paste this to get it started

```
import groovy.grape.Grape

Grape.grab(group:"org.gebish", module:"geb-core", version:"3.4")
Grape.grab(group:"org.seleniumhq.selenium", module:"selenium-firefox-driver", version:"3.14.0")
Grape.grab(autoDownload: true, group : 'org.seleniumhq.selenium', module : 'selenium-chrome-driver', version : '3.14.0')
Grape.grab(group:"org.seleniumhq.selenium", module:"selenium-chrome-driver", version:"3.14.0")

import geb.Browser
import org.openqa.selenium.Keys

browser = new Browser()
browser.drive { 
  go "https://duckduckgo.com/"
  def input = $('#search_form_input_homepage')
  input.value("youtube never gonna give you up")
  input << Keys.ENTER
  
  waitFor {
     $('#r1-0').click()
  }
  
  waitFor {
     $('.ytp-cued-thumbnail-overlay-image').click()
  }
}

```

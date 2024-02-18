from selenium import webdriver
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:

    driver.get("https://alchemy.hguy.co/lms")
    driver.find_element(By.XPATH, "//a[text()='My Account']").click()
    title = driver.title

    try:
        assert title == "My Account – Alchemy LMS"
        print("The title of the page is My Account – Alchemy LMS")
    except:
        print("The title does not match")

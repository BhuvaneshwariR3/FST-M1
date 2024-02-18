from selenium import webdriver
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://alchemy.hguy.co/lms")

    secondInfoBoxTitle = driver.find_element(By.XPATH, "(//h3)[2]").text

    try:
        assert secondInfoBoxTitle == "Interesting Quizzes"
        print("The title of the second Info Box is Interesting Quizzes")
    except:
        print("")


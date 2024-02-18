from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:

import pytest


def test_add():
    n1 = 2
    n2 = 3

    sum = n1 + n2

    assert sum == 5


def test_sub():
    n1 = 2
    n2 = 3

    sub = n2 - n1

    assert  sub == 1


def test_mul():
    n1 = 2
    n2 = 3

    mul = n1 * n2

    assert  mul == 6


def test_div():
    n1 = 6
    n2 = 3

    quo = n1/n2

    assert quo == 2
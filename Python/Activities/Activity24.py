import pytest


@pytest.fixture
def wallet_amt():
    amt = 0
    return amt


@pytest.mark.parametrize("earned, spent, expected", [(30, 10, 20), (20, 2, 18), ])
def test_transactions(wallet_amt, earned, spent, expected):
    wallet_amt += earned
    wallet_amt -= spent
    assert  wallet_amt == expected

# Soluvas Buzz - Twitter Collector

Twitter Collector is used to collect tweets over time related to a specific Twitter user,
it can be that user's tweets, mentions of that user, or both. It will first fetch tweets
from a specific time, then fetch the next pages of more recent tweets, until it reaches
current time then keep monitoring tweets from these two sources until stopped.

## Usage

Note: This is proposed usage of command line, but implementation is not yet written.

    ./twitter-collector --project=PROJECT_ID [--mode=USER|MENTIONS|BOTH] [--since=SINCE] SCREEN_NAME

* `--project=PROJECT_ID` specifies the project to save into, e.g. `helpdesk`.
* `--mode=USER` will only collect user's own tweets, no mentions.
* `--mode=MENTIONS` will only collect mentions (including user's tweets that mention themselves).
* `--mode=BOTH` (default) will collect both user's tweets and mentions.
* `--since=SINCE` is an ISO8601 formatted timestamp to start monitoring tweets.
    I think earliest by Twitter's limitation is 1 week ago.
* `SCREEN_NAME` is the Twitter user's screen name to monitor.

PostgreSQL database (default is `buzz_buzz_dev`) and schema (`buzz`) needs to be created beforehand.
It will create the table if not exists.

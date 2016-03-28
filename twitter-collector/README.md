# Soluvas Buzz - Twitter Collector

Twitter Collector is used to collect tweets over time related to a specific Twitter user,
it can be that user's tweets, mentions of that user, or both. It will first fetch tweets
from a specific time, then fetch the next pages of more recent tweets, until it reaches
current time then keep monitoring tweets from these two sources until stopped.

## Preparation

**Hendy's Note:** These configs are in `Dropbox\Hendy_Projects\Buzz\prd`

1. Edit `config/application.properties`:
    * If you use proxy, set proxy settings
    * Verify PostgreSQL database, username, and password
2. Create `TwitterApp` configuration, e.g. `config/buzz.TwitterApp.jsonld` or `config/lumen.TwitterApp.jsonld`  
3. Create `TwitterAuthorization` configuration, e.g. `config/buzz-hendybippo.TwitterApp.jsonld` or `config/lumen-lumenrobot.TwitterApp.jsonld`  
4. You can continue to **Usage** below.

## Usage

Note: This is proposed usage of command line, but implementation is not yet written.

    ./twitter-collector [--app=APP_ID] --auth=AUTH_ID --project=PROJECT_ID [--mode=USER|MENTIONS|BOTH] [--since=SINCE] SCREEN_NAME

* `--project=PROJECT_ID` specifies the project to save into, e.g. `helpdesk`.
* `--app=APP_ID`. Use specified TwitterApp configuration, i.e. `config/${APP_ID}.TwitterApp.jsonld`.
* `--auth=AUTH_ID`. Use specified TwitterAuthorization configuration, i.e. `config/${APP_ID}-${AUTH_ID}.TwitterAuthorization.jsonld`.
* `--mode=USER` will only collect user's own tweets, no mentions.
* `--mode=MENTIONS` will only collect mentions (including user's tweets that mention themselves).
* `--mode=BOTH` (default) will collect both user's tweets and mentions.
* `--since=SINCE` is an ISO8601 formatted timestamp to start monitoring tweets.
    I think earliest by Twitter's limitation is 1 week ago.
* `SCREEN_NAME` is the Twitter user's screen name to monitor.

PostgreSQL database (default is `buzz_buzz_dev`) and schema (`buzz`) needs to be created beforehand.
It will create the table if not exists.

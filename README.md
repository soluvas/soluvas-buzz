# Soluvas Buzz

## Two Primary Use Cases

Buzz is used for 2+1 different modes of operation:

1. *Social Media Client*. (account-centric)
   Tenant contains a Buzz app. The Buzz app is associated with a Facebook ConsumerApp and Twitter ConsumerApp,
   each containing the OAuth consumer ID & secret for respective social media.
   The Buzz app contains one or more Buzz Accounts (e.g. Hendy's, Yuni's, Adhis's).
   A Buzz Account is managed by one or more Buzz users (e.g. Hendy, Yuni, Adhis). A Buzz user
   may manage one or more Buzz Accounts.
   A Buzz Account is associated with one or more Social Links with freely mixed social media providers.
   Example Social Links:
   - @hendybippo Twitter user (personal)
   - @riasayu Twitter user (for business)
   - ceefour Facebook user (personal)
   - littlestarclothing Facebook page
   - Littlestar Facebook user
   Any Buzz user may post status update, photos, etc. to one or more Social Links
   available to that Buzz Account(s).
   All operations can be scheduled.
   All these operations may be performed via shell.

2. *App Social Media Integration*. (app user-centric)
   Tenant contains a Buzz app. The Buzz app is associated with a Facebook ConsumerApp and Twitter ConsumerApp,
   each containing the OAuth consumer ID & secret for respective social media.
   Tenant can provide one or more Person objects in a repository (e.g. Hendy, Arum, Sari).
   Additionally there may be other object types, e.g. Place.
   A Person or Place may be associated with:
   1. Primary links, one for each social media provider.
      Primary links are stored within Person object directly as attributes.
      They are used as login IDs too (optionally, it depends on the app, not Buzz).
   2. Zero or more additional Social Links with freely mixed social media providers,
   However 80% use cases will be Primary links only.
   Additional links are contained, referenced from Person.
   Typical users:
   - Yuni: @riasayu Twitter, yuni.riasayu Facebook, salonriasayu instagram, Yuni on GaulDong 
   Untypical users:
   - Adhis: Adhis Facebook, Littlestar Facebook, adhis instagram, Adhis on GaulDong, littlestarclothing Facebook page
   - Hendy: @hendybippo Twitter user, @hendyirawan Twitter, @heartnesia Twitter, ceefour Facebook
   Certain app actions, on behalf of app user, may post status update, photos, etc. to one or more Social Links
   available to that Buzz Account(s). The links used depend on app settings, user social & privacy preference,
   and per-post publishing settings.
   All operations can be scheduled.
   Publishing settings are: a. Simplified, b. Custom.
   In Simplified Mode, user can just choose "Publish to Facebook: Yes/No", "Publish to Twitter: Yes/No".
   All links matching criteria will be selected for publish.
   In Custom mode, user doesn't specify Facebook/Twitter, but check each link individually.
   All user-centric operations may be performed freely via shell.

There is also an extra mode of operation which complements any of the above:
*App Social*. (tenant-centric)
There is a tenant-wide BuzzAccount which contains the app's own Social Links.
Only scripts, tenant admins or shell can perform operations on these Social Links.
For XMI-only under this mode, use a (potentially modifiable) @tenant.BuzzAccount.xmi@ file containing
the app's links.

*To be determined*: Multi-Consumer mode. App contains two or more consumers,
and can be freely used. I'm not sure if this is useful, even for sysadmin purposes.
The problem is this is only usable with the *App Social* mode, since
otherwise OAuth tokens will need to be stored per consumer.
Since BuzzApp config is per-tenant anyway, a multitenant application is
automatically multi-consumer, although the multi-consumer support is only
usable at the webapp/shell level, not inside a tenant. And that there is
1:1 correspondence between consumer and tenant. 

## Storage: XMI, MongoDB, CouchDB

All data can be stored in XMI, where they're usually uneditable.

For website purpose MongoDB is recommended.

Experimental support for CouchDB, where the same data structure can be used in Android/iOS mobile apps.

With or without CouchDB, the data model is designed to be replicatable with offline support a la COuchDB.

## PostgreSQL

Create the database:

	CREATE DATABASE buzz_buzz_dev
	  WITH TEMPLATE = template0
	       ENCODING = 'UTF8'
	       LC_COLLATE = 'en_US.UTF-8'
	       LC_CTYPE = 'en_US.UTF-8';

## Spring Batch

All operations (whether on-demand or scheduled) are performed using Spring Batch. This ensure operations are logged properly,
and can be retried if failed, for example due to Twitter's rate limiting.

## Quartz Scheduling

Scheduled jobs are done using Quartz (app-wide), and persisted in PostgreSQL in `public` schema.

    psql -hlocalhost -Upostgres -w -fquartz.sql buzz_buzz_dev


## Credits

Icon by "Aha-Soft":http://www.aha-soft.com/icon-design.htm, licensed under Creative Commons (Attribution 3.0 Unported).

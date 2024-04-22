# Baza-Podataka-UDAS (UDAS database application)

## The idea

App that connects to and manages database for [UDAS Organization](https://www.udas.rs.ba/) .

The organization of amputees UDAS of Republika Srpska is a non-governmental organization that gathers mine victims, amputees and their family members to exercise their rights and integrate into the community. 
The organization was founded in 2002 by mine victims to provide support to other mine victims. The organization operates on the territory of Republika Srpska through regional associations 
in Banja Luka, Gradiška, Doboj, Bijeljina, East Sarajevo and Trebinje, as well as in the Federation of BiH through coordinators.

The program activities of the UDAS Organization aim to improve the quality of life of amputees, landmine victims as well as their family members in the direction of as comprehensive and complete integration into the community as possible. 
In accordance with the above, the Organization implements program activities in several areas:

Area of health and social protection
The field of economic reintegration
The area of legal regulation
The field of culture
The field of sports

UDAS organization has around 4000 members, and there is need to provide easy way to access, analyze and organize their data and social card.

Informations such as member name, surname, date of birth, injury type, disability kategory, employment, education etc. 
are currently written on papers which makes extracting any kind of statistical information (such as: how many landmine victims, or how many retired amputees missing etc..) and looking up any user specific information tedious and slow job.

***!!!DISCLAIMER!!!*** work on this application is voluntary and its purpose is to give out to community, while still learning and brusshing up personal skills.

## Implementation details and tech stack

1. Java based web application (Spring+Hibernate) for backend
2. Angular app for frontend

This includes:

- Defining data model that helds data for organisation member 
- Implementing REST API that enables CRUD operations on the data
- Implement security and privileges for user roles: admin, staff and user
- Implement Oauth2/OpenID connect support for registration and login
- Membership application page ( no login needed )

Role privileges:

- user: read only privileges on the database
- staff: read/write privileges for Organization Members but not editing "foreign tables" - i.e. cannot edit data that holds Cities or education levels as they are (almost) static
- admin: can edit all the data within schema, can manipulate with registrations and other user privileges

Oauth2/OpenID connect:

- idea is to be able to register authenticate via gmail account, 
- also, needed for frontend app auth

All of this above will make this application to be consisted of:

- login/registration page
- Organization Member lookup page
- Organization Member add/edit page
- Admin page for editing fairly static data such as cities, injury types, disability levels
- Admin page for managing user accounts and privileges

Membership application page:

- just a simple form that lets anyone fill and send their data that will end up within "applications" page for review and if approved by admin finish up in data
- another idea is not to automate this within app, but that member application form just sends an email to some of the stuff, its purely my idea and not discuessed with UDAS yet


Also, I intend to add some automation to building process too by using GHA, add linting and execute tests on PR, add coverage tool etc..



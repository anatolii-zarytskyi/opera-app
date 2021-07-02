## Opera application

---
OperaApp is an application to manage tickets bought on the occasion of an opera session by a user. 
An app can be used to organize the interactions between the customer and selling department, a user
has an opportunity to choose an available session, purchase tickets, make an order, login, register.
The App has integrated ability to manage opera sessions, performances, schedule, and 
administrating user' customer experience.

### Usage

---
<h4> Guest (unauthorized and non registered) can do the fllowing:</h4>
 - register
 - login
 - get all available performance sessions according to request
view current stages in Database

<h4>Authenticated user:</h4>

 - has the same capabilities as the guest + capability to
    - purchase tickets
    - add tickets to shoping cart
    - view purchase history
    - complete orders
    - check current shopping cart

<h4> Admin: </h4>

 - has the same capabilties of user, additionally can
   - add new performance sessions
   - manage stages
   - manage performances
   - administer schedule
   - add user/remove user

### Technologies

---
 - Spring - Core / MVC / Web / Security
- MySQL
- Hibernate
- Apache Maven
- Tomcat
- JSON

### Configuration

---
1. Clone this project into your local folder and open the project in an IDE.
2. Insert your own MySQL username and login in dbProperties in the ConnectionUtil class.
3. Configure Tomcat Server
4. Setup new connection with:
   - user: "your username"
   - password: "your password"
   - url: jdbc:mysql://xxxx:yyyy/kkkk?serverTimezone=UTC , where:
   - xxxx - host name,
   - yyyy - port,
   - kkkk - database name
    
5.Run a project

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
       <title>Booking</title>
    </head>
    <body>
      <h2>Booking details</h2>
      <form method="post">
         <input type="text" class="form-control mt-3" name="uname" placeholder="Your name as start"/>
         <input type="text" class="form-control mt-3" name="veh" placeholder="vehicle model"/>
         <input type="text" class="form-control mt-3" name="stn" placeholder="start date"/>
         <input type="text" class="form-control mt-3" name="rtn" placeholder="return date"/>
         <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
            <button class="btn btn-primary btn-lg">BOOK</button>
         </div>
      </form>
    </body>
</html>
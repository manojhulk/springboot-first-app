<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <style>
           body {
                   background-image: url('/images/mvp.jpg');
                   background-repeat: no-repeat;
                   background-attachment: fixed;
                   background-size: cover;
           }
           th,tr,td{
               color:white;
           }
        </style>
        <meta charset="UTF-8"/>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <h2 align="center" style="background-color:lightgrey">Booking Details:</h2>
        <table align="center" class="table table-striped table-hover">
          <thead>
            <tr>
              <th scope="col">Title</th>
              <th scope="col">Details</th>
            </tr>
          </thead>
          <tbody>
                <tr>
                  <th scope="row">BOOKING-ID</th>
                  <td>${owner.register}</td>
                </tr>
                <tr>
                   <th scope="row">PERSON NAME</th>
                   <td>${owner.person}</td>
                </tr>
                <tr>
                   <th scope="row">VehicleName</th>
                   <td>${owner.vehicletitle}</td>
                </tr>
                <tr>
                   <th scope="row">Price</th>
                   <td>${owner.price}</td>
                </tr>
                <tr>
                   <th scope="row">PickUpDate</th>
                   <td>${owner.pick}</td>
                </tr>
                <tr>
                   <th scope="row">Return Date</th>
                   <td>${owner.retcar}</td>
                </tr>

                <tr>
                   <th scope="row">Seating</th>
                   <td>${owner.seating}</td>
                </tr>
          </tbody>
        </table>
    </body>
</html>
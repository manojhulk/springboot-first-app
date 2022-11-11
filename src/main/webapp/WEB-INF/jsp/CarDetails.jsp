<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta charset="UTF-8"/>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <table align="center" class="table table-striped table-hover">
          <thead>
            <tr class="table-primary" text-align="center"col-span="3">Car Details:</tr>
            <tr>
              <th scope="col">Car Model</th>
              <th scope="col">Seating</th>
              <th scope="col">PricePerDay</th>
              <th scope="col">FuelType</th>
              <th scope="col">Book</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach items="${users}" var ="car">
                <tr>
                  <th scope="row">${car.carname}</td>
                  <td>${car.seats}</td>
                  <td>${car.price}</td>
                  <td>${car.fuelType}</td>
                  <td><a href="/booking" class="btn-btn-block mt-3"style="text-align:center">Book</a></td>
                </tr>
            </c:forEach>
          </tbody>
        </table>
    </body>
</html>
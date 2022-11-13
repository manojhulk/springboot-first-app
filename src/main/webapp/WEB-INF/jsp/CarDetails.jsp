<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>cardetails</title>
        <style>
           body {
                  background-image: url('/images/audi.jpg');
                  background-repeat: no-repeat;
                  background-attachment: fixed;
                  background-size:cover;
           }
        </style>
        <link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <h2 align="center">Car Details:</h2>
        <table align="center" class="table table-striped table-hover" style="width:80%">
          <thead>
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
                  <td><a href="/booking" class="btn-btn-block mt-3"style="text-align:center;text-decoration: none;">Book</a></td>
                </tr>
            </c:forEach>
          </tbody>
        </table><br><br>
        <form action="/">
          <h3>Price Filter</h3>
          <label for="quantity">(price between 500 and 5000):</label>
          <input type="number" id="quantity" name="amount" min="500" max="5000" required>
          <label for="order">Choose order</label>
          <select name="order">
             <option value="2" disabled>Choose option</option>
             <option value="0">Low-High</option>
             <option value="1">High-Low</option>
          </select>
          <div class="mt-2 pt-2">
            <input class="btn btn-primary btn-md" type="submit" value="Submit"/>
          </div>
    </body>
</html>
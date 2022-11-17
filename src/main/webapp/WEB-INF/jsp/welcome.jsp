<html>
<head>
     <style>
        body {
          background-image: url('/images/supercar.jpg');
          background-repeat: no-repeat;
          background-attachment: fixed;
          background-size: cover;
        }
     </style>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
     <title>welcome</title>

</head>
<body>
   <h2 align="center">Find Your car</h2>
   <form method="post" style="width:50%; margin-left:25%;">
         <input type="text" class="form-control mt-3" name="start" placeholder="Journey start" required/>
         <input type="text" class="form-control mt-3" name="end" placeholder="Journey end" required/>
         <input type="text" class="form-control mt-3" name="model" placeholder="vehicle Brand"/><br>
         <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
             <button class="btn btn-primary btn-lg">FIND</button>
         </div>
   </form><br>
   <form action="details" method="post" class="col-auto">
     <label for="fname">Enter Booking Id:</label>
     <input type="text" name="personId" required/>
     <div class="mt-2 pt-2">
       <input class="btn btn-primary btn-md" type="submit" value="Submit" />
     </div>
   </form>
</body>
</html>
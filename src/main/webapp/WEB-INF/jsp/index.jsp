<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<header>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Navbar</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="login.jsp">Login</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Dropdown
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="#">Action</a></li>
              <li><a class="dropdown-item" href="#">Another action</a></li>
              <li><hr class="dropdown-divider"></li>
              <li><a class="dropdown-item" href="#">Something else here</a></li>
            </ul>
          </li>
          <li class="nav-item">
            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
          </li>
        </ul>
        <div class="d-grid gap-2 d-md-flex justify-content-md-end">
          <ul>
            <li><a class="btn btn-primary me-md-2" href="#">LOGIN</a></li>
            <li><a class="btn btn-primary" href="#">SIGN UP</a></li>
          </ul>
        </div>
      </div>
    </div>
  </nav>
</header>

<div class="hero-area hero-s3 has-color">
        <div class="container">
            <div class="row">
                <div class="col-xl-10 offset-xl-1">
                    <div class="hero-content hero-content-s3">
                        <h3>admission</h3>
                        <h1><span class="primary-color">Your bright future is </span><b class="line-break"></b>our mission</h1>
                        <p>Find Your Preferred Courses & Improve Your Skills</p>
                        <form action="#">
                            <div class="form-input-box mt-5">
                                <div class="input">
                                    <input type="text" name="search" placeholder="Keyword  Search">
                                </div>
                                <div class="input">
                                    <select>
                                        <option selected disabled>Category Course</option>
                                        <option>Category Course</option>
                                        <option>Category Course</option>
                                    </select>
                                </div>
                                <div class="input">
                                    <select>
                                        <option selected disabled>Select Price Type</option>
                                        <option>Select Price Type</option>
                                        <option>Select Price Type</option>
                                        <option>Select Price Type</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-submit">
                                <button class="btn btn-primary"  type="submit">Search</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
</div>



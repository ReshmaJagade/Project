<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import JSTL supplied core tag lib --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--import Spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%-- import spring supplied form tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>The Energy Hub</title>
  <meta content="" name="description">

  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">
  <link rel="stylesheet" href="assets/css/datepicker.css" />
  <link href="assets/css/dataTables.bootstrap4.min.css" rel="stylesheet">

  <style>

    .card-signin {
      border: 0;
      border-radius: 1rem;
      box-shadow: 0 0.5rem 1rem 0 rgba(0, 0, 0, 0.1);
    }

    .card-signin .card-title {
      margin-bottom: 2rem;
      font-weight: 300;
      font-size: 1.5rem;
    }

    .card-signin .card-body {
      padding: 2rem;
    }

    /* .tab-content {
        border-left: 1px solid #ddd;
        border-right: 1px solid #ddd;
        border-bottom: 1px solid #ddd;
        padding: 10px;
    } */

    .nav-tabs {
        margin-bottom: 0;
    }

    .error {
      color: red;
      padding-top: 10px;
    }

    .navbar .getstarted1 {
      background: #4154f1;
      padding: 8px 20px;
      margin-left: 30px;
      border-radius: 4px;
      color: #fff;
    }

    .navbar .getstarted1:hover {
      color: #fff;
      background: #5969f3;
    }

  </style>

</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="header fixed-top">
    <div class="container-fluid container-xl d-flex align-items-center justify-content-between">
      <a href="#hero" class="logo d-flex align-items-center">
        <img src="assets/img/favicon.png" alt="">
        <span>The Energy Hub</span>
      </a>
      <nav id="navbar" class="navbar">
        <ul>
          <li><a class="nav-link scrollto active" href="#hero">Home</a></li>
         
          <li><a class="nav-link scrollto" href="#services">Services</a></li>
          <li><a class="nav-link scrollto" href="#contact">Contact</a></li>
          <li><a class="nav-link scrollto" href="/user/login">Login</a></li>  
          <li><a class="nav-link scrollto" href="/Registration">Registration</a></li>
         
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->
    </div>
  </header>
  <!-- End Header -->

  <!-- ======= Hero Section ======= -->
  <section id="hero" class="hero d-flex align-items-center">
    <div class="container">
      <div class="row">
        <div class="col-lg-6 d-flex flex-column justify-content-center">
          <h1 data-aos="fade-up">The Energy Hub</h1>
          <h2 data-aos="fade-up" data-aos-delay="400">Formed with a vision to encourage and inspire people to adopt a healthy lifestyle, It helps you in identifying the best types of workouts, diets, and nutrition plans that can help you reach your fitness goals.</h2>
          <div data-aos="fade-up" data-aos-delay="600">
            <div class="text-center text-lg-start">
              <a href="#services" class="btn-get-started scrollto d-inline-flex align-items-center justify-content-center align-self-center">
                <span>Get Started</span>
                <i class="bi bi-arrow-right"></i>
              </a>
            </div>            
          </div>
        </div>
        <div class="col-lg-6 hero-img" data-aos="zoom-out" data-aos-delay="200">
          <!-- <img src="assets/img/fitness.svg" class="img-fluid" alt=""> -->
          <div class="slideInRight slide-active"><object type="image/svg+xml" data="https://cdn2.fittr.com/static/images/svg-animi/fittr-family.svg"></object></div>
        </div>
      </div>
    </div>
  </section>
  <!-- End Hero -->

  <main id="main">    
    <!-- User Login Modal -->
    <!-- <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true"> -->
    <div class="modal fade" id="login" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="loginModalLabel" aria-hidden="true">
      <div class="modal-dialog modal-lg">
        <div class="modal-content" style="padding:20px;">      
            <div class="modal-header">
              <h5 class="modal-title fw-bold" id="staticBackdropLabel">Please Login</h5>
                <button type="button" class="btn-close" id="cm1" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            
            <div class="modal-body">              
              <ul class="nav nav-tabs" id="myTab" role="tablist">
                <li class="nav-item" role="presentation">
                  <button class="nav-link active" id="loggin-tab" data-bs-toggle="tab" data-bs-target="#loggin" type="button" role="tab" aria-controls="loggin" aria-selected="true">Login</button>
                </li>
               
                
              </ul>
              <div class="tab-content" id="myTabContent">
                <div class="text-center"><object><img src="https://cdn2.fittr.com/static/images/svg-animi/png/login.png" class="img-fluid" style="padding-top: 30px; padding-bottom: 0px;" height="600px" width="400px" alt=""></object></div>

                <div class="tab-pane fade show active" id="loggin" role="tabpanel" aria-labelledby="loggin-tab">                        
                  <!-- Login -->
                  <div class="card card-signin mt-5">
                    <div class="card-body">                            
                      <form class="form-signin" action="/user/login" id="logform" method="POST">
                        <div class="form-group">
                          <label for="inputUsername">Username</label>
                          <input type="text" id="username" name="username" class="form-control mt-2" placeholder="Enter Username"/>
                        </div>

                        <div class="form-group mt-4">
                          <label for="inputPassword">Password</label>  
                          <input type="password" id="password" name="password" class="form-control mt-2" placeholder="Enter Password"/>
                        </div>

                        <button class="btn btn-md btn-primary mt-3" type="submit" name="login">Sign in</button>
                        
                      </form>
                    </div>
                  </div>
                </div>

                
              </div>
            </div>
        </div>
      </div>
    </div>
    <!-- End Modal -->

     <div class="modal fade" id="registration" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="registrationModalLabel" aria-hidden="true">
      <div class="modal-dialog modal-lg">
        <div class="modal-content" style="padding:20px;">      
            <div class="modal-header">
              <h5 class="modal-title fw-bold" id="staticBackdropLabel">Please Register</h5>
                <button type="button" class="btn-close" id="cm1" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            
            <div class="modal-body">              
              <ul class="nav nav-tabs" id="myTab" role="tablist">
                
                <li class="nav-item" role="presentation">
                  <button class="nav-link active" id="registration-tab" data-bs-toggle="tab" data-bs-target="#registration" type="button" role="tab" aria-controls="registration" aria-selected="false">Registration</button>
                </li>
                
              </ul>
              <div class="tab-content" id="myTabContent">
                <div class="text-center"><object><img src="https://cdn2.fittr.com/static/images/svg-animi/png/login.png" class="img-fluid" style="padding-top: 30px; padding-bottom: 0px;" height="600px" width="400px" alt=""></object></div>

                <div class="tab-pane fade show active" id="registration" role="tabpanel" aria-labelledby="registration-tab">
                  <!-- Registration -->
                  <div class="card card-signin mt-5">
                    <div class="card-body">                            
                     
                    </div>
                  </div>
                </div>
              </div>
            </div>
        </div>
      </div>
    </div>
    <!-- End Modal -->

    <!-- ======= Counts Section ======= -->
    <section id="counts" class="counts">
      <div class="container" data-aos="fade-up">

        <div class="row gy-4">
        
          <div class="col-lg-3 col-md-6">
            <div class="count-box">
              <i class="bi bi-emoji-smile"></i>
              <div>
               <!--  <span data-purecounter-start="0" data-purecounter-end="100" data-purecounter-duration="1" class="purecounter"></span> -->
                <span data-purecounter-start="0" data-purecounter-end="${requestScope.count_member}" data-purecounter-duration="1" class="purecounter"></span>
                <p>Happy Clients</p>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6">
            <div class="count-box">
              <i class="bi bi-journal-richtext" style="color: #ee6c20;"></i>
              <div>
                <!-- <span data-purecounter-start="0" data-purecounter-end="100" data-purecounter-duration="1" class="purecounter"></span> -->
                <span data-purecounter-start="0" data-purecounter-end="${requestScope.count_package}" data-purecounter-duration="1" class="purecounter"></span>
                <p>Packages</p>
              </div>
            </div>
          </div>

        </div>

      </div>
    </section><!-- End Counts Section -->

    <!-- ======= Features Section ======= -->
    <section id="services" class="services">

      <div class="container" data-aos="fade-up">

        <header class="section-header">
          <!-- <h2>Services</h2> -->
          <p>Services</p>
        </header>

        <div class="row gy-4">
          
            <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="200">
              <div class="service-box blue">
                <img src="../../resources/uploads/Facility/ONFITFACL001.jpg" style="width:300px; border-radius:10%; margin:10px;">
                <h3 style="padding-top: 30px;">CARDIO AREA</h3>
                <p style="padding-top: 20px;">Get your body working and your heart pumping at our Cardio Area.</p>                
              </div>
            </div>
         
         <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="200">
              <div class="service-box blue">
                <img src="../../resources/uploads/Facility/ONFITFACL002.jpg" style="width:300px; border-radius:10%; margin:10px;">
                <h3 style="padding-top: 30px;">CYCLING STUDIO</h3>
                <p style="padding-top: 20px;">Ride to the rhythm of energetic music and reach higher levels of fitness, endurance and strength.</p>                
              </div>
            </div>
         
         <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="200">
              <div class="service-box blue">
                <img src="../../resources/uploads/Facility/ONFITFACL003.jpg" style="width:300px; border-radius:10%; margin:10px;">
                <h3 style="padding-top: 30px;">FREE WEIGHTS AREA</h3>
                <p style="padding-top: 20px;">FREE WEIGHTS ARE AVAILABLE TO ALL MEMBERS.</p>                
              </div>
            </div>
         
         <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="200">
              <div class="service-box blue">
                <img src="../../resources/uploads/Facility/ONFITFACL004.jpg" style="width:300px; border-radius:10%; margin:10px;">
                <h3 style="padding-top: 30px;">WEIGHT LIFTING</h3>
                <p style="padding-top: 20px;">WEIGHT LIFTING AVAILABLE FOR ALL MEMBERS.</p>                
              </div>
            </div>
         
         <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="200">
              <div class="service-box blue">
                <img src="../../resources/uploads/Facility/ONFITFACL005.jpg" style="width:300px; border-radius:10%; margin:10px;">
                <h3 style="padding-top: 30px;">LOUNGE</h3>
                <p style="padding-top: 20px;">LOUNGE.</p>                
              </div>
            </div>
         
         <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="200">
              <div class="service-box blue">
                <img src="../../resources/uploads/Facility/ONFITFACL006.jpg" style="width:300px; border-radius:10%; margin:10px;">
                <h3 style="padding-top: 30px;">MAIN STUDIO</h3>
                <p style="padding-top: 20px;">Get your body grooving to the hippest beats with the various Group Fitness classes held in the trendy main studio.</p>                
              </div>
            </div>
         
         <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="200">
              <div class="service-box blue">
                <img src="../../resources/uploads/Facility/ONFITFACL007.jpg" style="width:300px; border-radius:10%; margin:10px;">
                <h3 style="padding-top: 30px;">PLAYGROUND</h3>
                <p style="padding-top: 20px;">Amp up your performance in our well-equipped Playground.</p>                
              </div>
            </div>
         
         <div class="col-lg-4 col-md-6" data-aos="fade-up" data-aos-delay="200">
              <div class="service-box blue">
                <img src="../../resources/uploads/Facility/ONFITFACL008.jpg" style="width:300px; border-radius:10%; margin:10px;">
                <h3 style="padding-top: 30px;">STRENGTH AREA</h3>
                <p style="padding-top: 20px;">Our fully-equipped strength-training area lets you go beast mode on all parts of your body.</p>                
              </div>
            </div>
        </div> 
      </div>

    </section>

    <!-- ======= Contact Section ======= -->
    <section id="contact" class="contact">

      <div class="container" data-aos="fade-up">

        <header class="section-header">
          <!-- <h2>Contact</h2> -->
          <p>Contact Us</p>
        </header>

        <div class="row gy-4">

          <div class="col-lg-6">

            <div class="row gy-4">
              <div class="col-md-6">
                <div class="info-box">
                  <i class="bi bi-geo-alt"></i>
                  <h3>Address</h3>
                  <p>Balajinagar,<br>Pune-43</p>
                </div>
              </div>
              <div class="col-md-6">
                <div class="info-box">
                  <i class="bi bi-telephone"></i>
                  <h3>Call Us</h3>
                  <p>+91 9881 988998<br>+91 9665 699669</p>
                </div>
              </div>
              <div class="col-md-6">
                <div class="info-box">
                  <i class="bi bi-envelope"></i>
                  <h3>Email Us</h3>
                  <p>info@theenergyhub.com<br>contact@theenergyhub.com</p>
                </div>
              </div>
              <div class="col-md-6">
                <div class="info-box">
                  <i class="bi bi-clock"></i>
                  <h3>Open Hours</h3>
                  <p>Monday - Friday<br>9:00AM - 09:00PM</p>
                </div>
              </div>
            </div>

          </div>

          <div class="col-lg-6">
            <form action="#" method="post" class="php-email-form">
              <div class="row gy-4">

                <div class="col-md-6">
                  <input type="text" name="name" class="form-control" placeholder="Your Name" required>
                </div>

                <div class="col-md-6 ">
                  <input type="email" class="form-control" name="email" placeholder="Your Email" required>
                </div>

                <div class="col-md-12">
                  <input type="text" class="form-control" name="subject" placeholder="Subject" required>
                </div>

                <div class="col-md-12">
                  <textarea class="form-control" name="message" rows="6" placeholder="Message" required></textarea>
                </div>

                <div class="col-md-12 text-center">
                  <div class="loading">Loading</div>
                  <div class="error-message"></div>
                  <div class="sent-message">Your message has been sent. Thank you!</div>

                  <button type="submit">Send Message</button>
                </div>

              </div>
            </form>

          </div>

        </div>

      </div>

    </section><!-- End Contact Section -->

  </main>
  <!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">

    <div class="footer-top">
      <div class="container">
        <div class="row gy-4">
          <div class="col-lg-5 col-md-12 footer-info">
            <a href="index.jsp" class="logo d-flex align-items-center">
              <img src="assets/img/favicon.png" alt="">
              <span>The Energy Hub</span>
            </a>
            <p>Formed with a vision to encourage and inspire people to adopt a healthy lifestyle, It helps you in identifying the best types of workouts, diets, and nutrition plans that can help you reach your fitness goals.</p>
            <div class="social-links mt-3">
              <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
              <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
              <a href="#" class="instagram"><i class="bi bi-instagram bx bxl-instagram"></i></a>
              <a href="#" class="linkedin"><i class="bi bi-linkedin bx bxl-linkedin"></i></a>
            </div>
          </div>

          <div class="col-lg-2 col-6 footer-links">
            <h4>Useful Links</h4>
            <ul>
              <li><i class="bi bi-chevron-right"></i> <a class="scrollto" href="#">Home</a></li>
              <li><i class="bi bi-chevron-right"></i> <a class="scrollto" href="#hero">About us</a></li>
              <li><i class="bi bi-chevron-right"></i> <a class="scrollto" href="#services">Services</a></li>
              <li><i class="bi bi-chevron-right"></i> <a class="scrollto" href="#">Terms of service</a></li>
              <li><i class="bi bi-chevron-right"></i> <a class="scrollto" href="#">Privacy policy</a></li>
            </ul>
          </div>

          <div class="col-lg-2 col-6 footer-links">
            <h4>Our Services</h4>
            <!-- <ul>
              <li><i class="bi bi-chevron-right"></i> <a href="#">Web Design</a></li>
              <li><i class="bi bi-chevron-right"></i> <a href="#">Web Development</a></li>
              <li><i class="bi bi-chevron-right"></i> <a href="#">Product Management</a></li>
              <li><i class="bi bi-chevron-right"></i> <a href="#">Marketing</a></li>
              <li><i class="bi bi-chevron-right"></i> <a href="#">Graphic Design</a></li>
            </ul> -->
          </div>

          <!-- <div class="col-lg-3 col-md-12 footer-contact text-center text-md-start">
            <h4>Contact Us</h4>
            <p>
              A108 Adam Street <br>
              New York, NY 535022<br>
              United States <br><br>
              <strong>Phone:</strong> +1 5589 55488 55<br>
              <strong>Email:</strong> info@example.com<br>
            </p>

          </div> -->

        </div>
      </div>
    </div>

    <div class="container">
      <div class="copyright">  
        <footer>Copyright &copy; <%= new java.text.SimpleDateFormat("yyyy").format(new java.util.Date()) %> <a>The Energy Hub</a> - All rights reserved. </footer>
      </div>          
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->  
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
  <script src="assets/vendor/aos/aos.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>
  <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="assets/vendor/purecounter/purecounter.js"></script>
  <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
  
  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>
  <script src="assets/js/jquery-3.6.0.min.js"></script>
  <script src="assets/js/jquery.validate.js"></script>
  <script src="assets/js/jquery.dataTables.min.js"></script>
  <script src="assets/js/dataTables.bootstrap4.min.js"></script>

  <script type="text/javascript" src="assets/js/bootstrap-datepicker.js"></script>

  <script>
  	$(document).ready(function(){

      $('#inputDob').datepicker({
        format:'yyyy-mm-dd',
        autoclose:true,
        container: '#regform modal-body'
      });

      $("#regform").validate({
        rules: {	   
          inputName: {
            required: true,
            minlength: 2
          },
          // compound rule
          inputMobile:{
            required: true,
              number: true,
              minlength:10,
              maxlength:10
          },
          inputEmail: {
            required: true,
            email: true
          },
          
          inputAddress:"required",
          inputDob:"required",
          inputGender:"required",
          inputCityCode:"required",
          inputPassword:{
            required: true,
            minlength: 5
          },
          inputConfirmPassword:{
            required: true,
            minlength: 5,
            equalTo: "#inputPassword"
          },
        },
        messages: {
          inputName:"Please Enter Full Name!!!",
          inputCityCode:"Please Enter City Code (Pin Code)!!!",
          inputMobile:{
            required:"Please Enter Mobile Number!!!",
            maxlength:"Please Enter Valid Mobile Number!!!",
            number:"Please Enter Valid Mobile Number!!!"
          },
          inputEmail: {
            required: "Please Enter Email ID!!!",
            email: "Please Enter Valid Email ID!!!"
          },
          inputAddress:"Please Enter Your Address!!!", 
          inputDob:"Please Enter Date of Birth!!!", 
          inputGender:"Please Select Your Gender!!!", 
          inputPassword: {
            required: "Please provide a password!!!",
            minlength: "Your password must be at least 5 characters long!!!"
          },
          inputConfirmPassword: {
            required: "Please provide a password!!!",
            minlength: "Your password must be at least 5 characters long!!!",
            equalTo: "Please enter the same password as above!!!"
          },

        }
      });

      $("#logform").validate({
        rules: {	   
            inputMobile:{
              required: true,
              number: true,
              minlength:10,
              maxlength:10
            },
            inputPassword:{
              required: true
            }
        },
        messages: {
          inputMobile:{
              required:"Please Enter Mobile Number!!!",
              maxlength:"Please Enter Valid Mobile Number!!!",
              number:"Please Enter Valid Mobile Number!!!"
            },
            inputPassword:{
              //logpass:"Please Enter Your Password",
              required:"Please Enter Your Password!!!"
            }
        }
      });

      $("#adminlogform").validate({
        rules: {	   
            adminMobile:{
              required: true,
              number: true,
              minlength:10,
              maxlength:10
            },
            adminPassword:{
              required: true
            }
        },
        messages: {
          adminMobile:{
              required:"Please Enter Mobile Number!!!",
              maxlength:"Please Enter Valid Mobile Number!!!",
              number:"Please Enter Valid Mobile Number!!!"
            },
            adminPassword:{
              //logpass:"Please Enter Your Password",
              required:"Please Enter Your Password!!!"
            }
        }
      });
      
      $("#ulogin").click(function () {
        $("#login").modal("show");
        return false;
      });
      $("#uregistration").click(function () {
          $("#registration").modal("show");
          return false;
        });

      $('#cm1').click(function () {
        $("#login").modal("hide");          
      });

      $("#alogin").click(function () {
        $("#adminlogin").modal("show");
        return false;
      });

      $('#cm2').click(function () {
        $("#adminlogin").modal("hide");          
      });

  	});	
  </script>	

</body>

</html>
<form action="action_page.php">
  <div class="container">
    <h1>New user Register page</h1>
    <p>Please fill this form to create an account</p>
    <hr>
     
    <label for="Name"><b>Enter your Name</b></label>
    <input type="text" placeholder="Enter Full Name" name="Name" id="Name" required>
    <br>
    
    <label for="mobile"><b>Enter mobile number</b></label>
    <input type="text" placeholder="Enter moible number" name="mobile" id="mobile" required>
    <br>

    <label for="email"><b>Enter Email address</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>
    <br>

    <label for="Location"><b>Enter Location</b></label>
    <input type="text" placeholder="Enter Location" name="Location" id="Location" required>
    <br>

    <label for="psw"><b>Enter Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>
    <br>

    <label for="psw-repeat"><b>Re-enter the Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>
    <hr>
    <br>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</button>
  </div>
  <div class="container signin">
    <p> Already have an account? Then Log-in:<a href="#"> Sign in </a>.</p>
  </div>
</form>

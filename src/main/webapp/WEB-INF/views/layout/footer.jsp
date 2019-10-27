<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Footer -->
		<footer id="footer" class="py-5">
			<div class="container">
				<div class="row  py-lg-5">
					<div class="col-lg-3 col-sm-6 footer-logo">
						<h5>about us</h5>
						<h2>
							<a href="index.html">Real Estate</a>
						</h2>
						<p class="mt-3">Nulla quis lorem ut libermalesuada ultrices posuere cubilia feugiatrice praesent sapien massa</p>
					</div>
					<div class="col-lg-3 col-sm-6 mt-sm-0 mt-4">
						<h5>Quick links</h5>
						<ul class="list-unstyled quick-links">
							<li>
								<a href="index.html">
								<i class="fa fa-angle-double-right"></i>Home</a>
							</li>
							<li>
								<a href="about.html">
									<i class="fa fa-angle-double-right"></i>About</a>
							</li>
							<li>
								<a href="services.html">
									<i class="fa fa-angle-double-right"></i>Services</a>
							</li>
							<li>
								<a href="gallery.html">
									<i class="fa fa-angle-double-right"></i>Gallery</a>
							</li>
							<li>
								<a href="contact.html">
									<i class="fa fa-angle-double-right"></i>Contact</a>
							</li>
						</ul>
					</div>
					<div class="col-lg-3 col-sm-6 mt-lg-0 mt-4">
						<h5>working hours</h5>
						<ul class="list-unstyled quick-links">
							<li>
								Monday - Friday
								<br>
								<span>9.00 - 20.00</span>
							</li>
							<li>
								Saturday
								<br>
								<span> 10.00 - 16.00 </span>
							</li>
							<li>
								Sunday
								<br>
								<span> 9.30 - 18.00 </span>
							</li>
						</ul>
					</div>
					<div class="col-lg-3 col-sm-6 footer_grid1 mt-lg-0 mt-4">
						<h5>Address</h5>
						<div class="fv3-contact">
							<span class="fas fa-envelope-open mr-2"></span>
							<p>
								<a href="mailto:example@email.com">info@example.com</a>
							</p>
						</div>
						<div class="fv3-contact my-2">
							<span class="fas fa-phone-volume mr-2"></span>
							<p>+456 123 7890</p>
						</div>
						<div class="fv3-contact">
							<span class="fas fa-home mr-2"></span>
							<p>+90 nsequursu dsdesdc,
								<br>xxx Street State 34789.</p>
						</div>
					</div>
				</div>
			</div>
		</footer>
		<div class="cpy-right text-center py-4">
			<p class="text-white">© 2018 Vicarage. All rights reserved | Design by
				<a href="http://w3layouts.com"> W3layouts.</a>
			</p>
		</div>
	</div>
	
	<!-- js -->
    <script src="../assets/js/jquery-2.2.3.min.js"></script>
    <!-- //js -->
	<!-- FlexSlider-JavaScript -->
	<script defer src="../assets/js/jquery.flexslider.js"></script>
	<script type="text/javascript">
		
				$(window).load(function(){
				$('.flexslider').flexslider({
					animation: "slide",
					start: function(slider){
						$('body').removeClass('loading');
					}
			});
		});
	</script>
<!-- //FlexSlider-JavaScript -->
    
    
    <!-- start-smooth-scrolling -->
    <script src="../assets/js/move-top.js"></script>
    <script src="../assets/js/easing.js"></script>
    <script>
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();

                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 1000);
            });
        });
    </script>
    <!-- //end-smooth-scrolling -->
    <!-- smooth-scrolling-of-move-up -->
    <script>
        $(document).ready(function () {
            /*
            var defaults = {
                containerID: 'toTop', // fading element id
                containerHoverID: 'toTopHover', // fading element hover id
                scrollSpeed: 1200,
                easingType: 'linear' 
            };
            */

            $().UItoTop({
                easingType: 'easeOutQuart'
            });

        });
    </script>
    <script src="../assets/js/SmoothScroll.min.js"></script>
    <!-- //smooth-scrolling-of-move-up -->
    <!-- Bootstrap core JavaScript
================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../assets/js/bootstrap.js"></script>
</body>
</html>
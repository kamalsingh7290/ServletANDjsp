$(document).ready(function(){
    $(window).scroll(function(){
        if(this.scrollY > 20){
            $('.navbar').addClass("sticky");
        }else{
            $('.navbar').removeClass("sticky");
        }
        if(this.scrollY > 500){
            $('.scroll-up-btn').addClass("show"); 

        }else{
            $('.scroll-up-btn').removeClass("show");
        }
    });
    $('.scroll-up-down').click(function(){
        $('html').animate({scrollTop: 0});
    });

    $('.menu-btn').click(function(){
        $('.navbar .menu').toggleClass("active");
        $('.menu-btn').toggleClass("active");
    });
    $('.carousel').owlCarousel({
        margin: 20,
        items:4,
        loop: true,
        // autoplay:true,
        autoplayTimeOut: 500,
        autoplayHoverPause: true,
        responsive: {
            0:{
                items: 1,
                // nav: true
            },
            600:{
                items: 2,
                // nav: true
            },
            1000:{
                items: 3,
                // nav: true
            }
        }
    });
});
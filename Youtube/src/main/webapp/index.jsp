
<%
if(session.getAttribute("name")==null){
	
	response.sendRedirect("register1.jsp");
}
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Youtube Clone</title>

    <link rel="stylesheet" href="style.css">

</head>
<body>

    <nav class="navbar">
        <div class="toggle-btn">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <img src="img/logo.png" class="logo" alt="">
        <div class="search-box">
            <input type="text" class="search-bar" placeholder="search">
            <button class="search-btn"><img src="img/search.png" alt=""></button>
        </div>
        <div class="user-options">
            <img src="img/video.png" class="icon" alt="">
            <img src="img/grid.png" class="icon" alt="">
            <img src="img/bell.png" class="icon" alt="">
            <div class="user-dp">
                <img src="img/profile-pic.png" alt="">
            </div>
        </div>
    </nav>

    <!-- sidebar -->
    <div class="side-bar">
        <a href="#" class="links active"><img src="img/home.png" alt="">home</a>
        <a href="#" class="links"><img src="img/explore.png" alt="">explore</a>
        <a href="#" class="links"><img src="img/subscription.png" alt="">subscription</a>
        <hr class="seperator">
        <a href="#" class="links"><img src="img/library.png" alt="">library</a>
        <a href="#" class="links"><img src="img/history.png" alt="">history</a>
        <a href="#" class="links"><img src="img/your-video.png" alt="">your video</a>
        <a href="#" class="links"><img src="img/watch-later.png" alt="">watch leater</a>
        <a href="#" class="links"><img src="img/liked video.png" alt="">like video</a>
        <a href="#" class="links"><img src="img/show more.png" alt="">show more</a>
    </div>

    <!-- filters -->
    <div class="filters">
        <button class="filter-options active">all</button>
        <button class="filter-options">CSS</button>
        <button class="filter-options">web development</button>
        <button class="filter-options">python</button>
        <button class="filter-options">entertainment</button>
        <button class="filter-options">marvel</button>
        <button class="filter-options">javascript</button>
        <button class="filter-options">artificial intelligence</button>
        <button class="filter-options">machine learning</button>
        <button class="filter-options">trending</button>
    </div>

    <!-- videos -->
    <div class="video-container">
        <!-- <div class="video">
            <img src="img/profile-pic.png" class="thumbnail" alt="">
            <div class="content">
                <img src="img/profile-pic.png" class="channel-icon" alt="">
                <div class="info">
                    <h4 class="title">youtube clone 2021 | create working youtube clone</h4>
                    <p class="channel-name">modern web</p>
                </div>
            </div>
        </div> -->
    </div>

    
</body>
</html>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Top posts</title>

    <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
    <link href="/css/freelancer.min.css" rel="stylesheet">

</head>

<body id="page-top">

<!-- Header -->
<header class="masthead">
    <div class="container">
        <img class="img-fluid" src="img/tech.png" alt="">
        <div class="intro-text">
            <span class="name">top posts <a style="color: white" href="https://techcrunch.com/popular/">techcrunch</a></span>
            <hr class="star-light">
            <#list popularpost as post>
                <p>${post?counter} ${post}</p>
            <#else>
                <p>No hay post! :(</p>
            </#list>
        </div>
    </div>
</header>

</body>

</html>

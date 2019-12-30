<!DOCTYPE html>
       <html lang="en">
       <head>
           <meta charset="UTF-8">
           <title>WelcomePage</title>
       </head>
       <body>

        <h1>Here are your thoughts: ${param.thinkOut}<h1>

        <form action="processForm" method="GET">
                <input type="text" name="thinkOut"
                    placeholder="Think out the implications of the scripture"/>

        </form>

        <hr>
        <a href="main">Main Menu</a>

       </body>
       </html>
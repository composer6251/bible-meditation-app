
<!DOCTYPE html>
       <html lang="en">
       <head>
           <meta charset="UTF-8">
           <title>WelcomePage</title>
       </head>
       <body>

        <h1>Think In: Internalize the implications from think out<h1>

        <h2>Think In<h2>

        <hr>

        <form:form action="processForm" modelAttributes="thinkInModel">

        Clause Placeholder 1: <form:input path="thinkIn" />

        <br><br>

        Clause Placeholder 2: <form:input path="thinkIn2" />

        <br><br>
            <input type="submit" value="submit" />

         </form:form>


        <form action="processForm" method="GET">
                <input type="text" name="thinkIn"
                    placeholder="Think in the implications"/>
        </form>

        <hr>
        <a href="main">Main Menu</a>

       </body>
       </html>
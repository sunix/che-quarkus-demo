# CodeReady Workspaces: code your Microservices


   <script>

  var allcookies = document.cookie;
  document.write ("All Cookies : " + allcookies );

  var today = new Date();
  var expiry = new Date(today.getTime() + 30 * 24 * 3600 * 1000); // plus 30 days

  function setCookie(name, value)
  {
    document.cookie=name + "=" + escape(value) + "; path=/; expires=" + expiry.toGMTString();
  }
  function putCookie(form)
                //this should set the UserName cookie to the proper value;
  {
   setCookie("userName", form[0].usrname.value);

    return true;
  }

function listCookies() {
    var theCookies = document.cookie.split(';');
    var aString = '';
    for (var i = 1 ; i <= theCookies.length; i++) {
        aString += i + ' ' + theCookies[i-1] + "\n";
    }
    return aString;
}
  </script>

<form>
 <input type="text" value="Enter Your Nickname" id="nameBox" name='usrname'>
 <input type="button" value="Go!" id="submit" onclick="putCookie(document.getElementsByTagName('form'));">
</form>

To run this demo:

[![Contribute](factory-contribute.svg)](http://codeready-crw.apps.cluster-paris-8455.paris-8455.example.opentlc.com/f?url=https://raw.githubusercontent.com/sunix/che-quarkus-demo/microservices/devfile.yaml)

or

```
https://<your-codeready-workspaces-instance>/f?url=https://raw.githubusercontent.com/sunix/che-quarkus-demo/microservices/devfile.yaml
```


![Application topology](topology.png "Application Topology")

![CodeReady Workspaces](codeready-workspaces-preview.png "CodeReady Workspaces")


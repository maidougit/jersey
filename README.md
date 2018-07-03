<style>
body {
/*width: 45em;*/
border: 1px solid #ddd;
outline: 1300px solid #fff;
margin: 16px auto;
max-width:2500px
}
/*左边目录框的样式*/
.left-div 
{
height: 80%; /*目录框的高度*/
float:left;/*目录框的位置*/
overflow-y:scroll;/*目录框添加滚动条*/
padding-right: 10px;
position: fixed;/*目录框相对浏览器进行定位*/
width:17%;/*目录框的宽度*/
}
/*右边正文的样式*/
.right-div 
{
float:right;/*正文的位置*/
padding-left: 10px;/*边距*/
width:80%;/*正文的宽度*/
}
table {
width: 100%; /*表格宽度*/
max-width: 65em; /*表格最大宽度，避免表格过宽*/
border: 1px solid #dedede; /*表格外边框设置*/
margin: 15px auto; /*外边距*/
border-collapse: collapse; /*使用单一线条的边框*/
empty-cells: show; /*单元格无内容依旧绘制边框*/
}
table th,
table td {
  height: 35px; /*统一每一行的默认高度*/
  border: 1px solid #dedede; /*内部边框样式*/
  padding: 0 10px; /*内边距*/
}
table th {
font-weight: bold; /*加粗*/
text-align: center !important; /*内容居中，加上 !important 避免被 Markdown 样式覆盖*/
background: rgba(158,188,226,0.2); /*背景色*/
}
table tbody tr:nth-child(2n) {
background: rgba(158,188,226,0.12); 
}
table tr:hover {
background: #efefef; 
}
table th {
white-space: nowrap; /*表头内容强制在一行显示*/
}
table td:nth-child(1) {
white-space: nowrap; 
}
.fontcolor{
color:red
}
.greencolor{
color:#00BFFF
}
.bluecolor{
color:blue
}
.not_do{
color:#yellow
}
</style>

# <center>jersey-rest

**注解说明**

|Annotation|作用|说明|
|:--:|:--:|:--:|
|@GET|查询请求|相当于数据库的查询数据操作|
|@POST|插入请求|	相当于数据库的插入数据操作|
|@PUT|更新请求|	相当于数据库的更新数据操作|
|@DELETE|	删除请求|	相当于数据的删除数据操作|
|@Path	|uri路径	定义资源的访问路径|，client通过这个路径访问资源。比如：@Path("user")|
|@Produces|	指定返回MIME格式|	资源按照那种数据格式返回，可取的值有：MediaType.APPLICATION_XXX。比如：@Produces(MediaType.APPLICATION_XML)|
|@Consumes|	接受指定的MIME格式|	只有符合这个参数设置的请求再能访问到这个资源。比如@Consumes("application/x-www-form-urlencoded")|
|@PathParam|	uri路径参数|	写在方法的参数中，获得请求路径参数。比如：@PathParam("username") String userName|
|@QueryParam|	uri路径请求参数|	写在方法的参数中，获得请求路径附带的参数。比如：@QueryParam("desc") String desc|
|@DefaultValue|	设置@QueryParam参数的默认值|	如果@QueryParam没有接收到值，就使用默认值。比如：@DefaultValue("description") @QueryParam("desc") String desc|
|@FormParam|	form传递的参数|	接受form传递过来的参数。比如：@FormParam("name") String userName|
|@BeanParam|	通过Bena的形式传递参数|	接受client传递的bean类型的参数，同时这个bean可以在属性上配置@FormParam用以解决client的属性名称和bean的属性名称不一致的问题。比如：@BeanParam User user
|@Context|	获得一些系统环境信息|	通过@Context可以获得以下信息：UriInfo、ServletConfig、ServletContext、HttpServletRequest、HttpServletResponse和HttpHeaders等|
|@XmlRootElement|	将bean转换为xml|	如果要讲bean以xml或json的格式返回，必须要这个注解。比如@XmlRootElement public class User{...}|

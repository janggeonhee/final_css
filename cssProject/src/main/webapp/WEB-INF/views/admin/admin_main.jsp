<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url ="/WEB-INF/views/include/header.jsp"/>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 2 | Starter</title>
  <!-- Morris charts -->
  <link rel="stylesheet" href="resources/bower_components/morris.js/morris.css">
<style>

</style>
</head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
	
	<c:import url="admin_side.jsp"/>
  
  

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper" style="height:100%;">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        관리자 페이지
        <small>CSS_관리부</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>
	

    <!-- Main content -->
    <section class="content container-fluid">
	<div class="box box-info" style="width:49%;">
            <div class="box-header with-border">
              <h3 class="box-title">CSS 이용회원</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
              </div>
            </div>
            <div class="box-body chart-responsive">
              <div class="chart" id="line-chart" style="height: 300px;"></div>
            </div>
            <!-- /.box-body -->
          </div>

      <!--------------------------
        | Your Page Content Here |
        -------------------------->

    </section>
    <!-- Left col -->
          <!-- MAP & BOX PANE -->
          <div class="box box-success" style="width:50%; margin-left:5px;">
            <div class="box-header with-border">
              <h3 class="box-title">지역별 분포도</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body no-padding">
              <div class="row">
                <div class="col-md-9 col-sm-8">
                  <div class="pad">
                    <!-- Map will be created here -->
                    <div id="world-map-markers" style="height: 325px;"></div>
                  </div>
                </div>
              </div>
              <!-- /.row -->
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
    </div>
    
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->




	<c:import url="../include/footer.jsp"/>
<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
     <!-- Morris.js charts -->
<script src="resources/bower_components/raphael/raphael.min.js"></script>
<script src="resources/bower_components/morris.js/morris.min.js"></script>
<!-- page script -->
<script>
  $(function () {
    "use strict";

    // LINE CHART
    var line = new Morris.Line({
      element: 'line-chart',
      resize: true,
      data: [
        {y: '2016-01', item1: 1},
        {y: '2016-04', item1: 7},
        {y: '2016-07', item1: 13},
        {y: '2016-10', item1: 21},
        {y: '2017-01', item1: 41},
        {y: '2017-04', item1: 48},
        {y: '2017-07', item1: 53},
        {y: '2017-10', item1: 59},
        {y: '2018-01', item1: 67},
        {y: '2018-04', item1: 88},
        {y: '2018-07', item1: 91}
      ],
      xkey: 'y',
      ykeys: ['item1'],
      labels: ['Item 1'],
      xLabels:'month',
      lineColors: ['#3c8dbc'],
      hideHover: 'auto'
    });
  });
</script>
</body>
</html>
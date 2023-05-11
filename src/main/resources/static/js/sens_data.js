    function pulse() {
        $('#t_temp').load(location.href+' #t_temp');
        $('#t_humi').load(location.href+' #t_humi');
        $('#t_co').load(location.href+' #t_co');
        $('#e_temp').load(location.href+' #e_temp');
        $('#e_humi').load(location.href+' #e_humi');
        $('#e_co2').load(location.href+' #e_co2');
        $('#e_co').load(location.href+' #e_co');
        $('#e_h2').load(location.href+' #e_h2');
        $('#e_voc').load(location.href+' #e_voc');
        $('#e_voltage').load(location.href+' #e_voltage');
        $('#e_current').load(location.href+' #e_current');
        $('#e_charge').load(location.href+' #e_charge');
        $('#e_discharge').load(location.href+' #e_discharge');
    }

    var change1 = setInterval(pulse, 5000);

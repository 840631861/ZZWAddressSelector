package com.zzw.addressselector.listener;


import com.zzw.addressselector.model.City;
import com.zzw.addressselector.model.County;
import com.zzw.addressselector.model.Province;
import com.zzw.addressselector.model.Street;

public interface OnAddressSelectedListener {
    // 获取地址完成回调
    void onAddressSelected(Province province, City city, County county, Street street);
    // 选取省份完成回调
    void onProvinceSelected(Province province);
    // 选取城市完成回调
    void onCitySelected(City city);
    // 选取区/县完成回调
    void onCountySelected(County county);
    // 确认的回调
    void onConfirmClick(Province province, City city, County county, Street street);
    // 取消的回调
    void onCancelClick();
}

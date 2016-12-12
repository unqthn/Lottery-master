package com.example.lottery.adapter;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.lottery.R;
import com.example.lottery.etc.Utils;
import com.example.lottery.model.Lottery;
import com.example.lottery.model.PreviosImage;
import com.example.lottery.model.SearchLottery;

import java.util.ArrayList;

public class PreviousLottery extends ArrayAdapter<PreviosImage>{

    private Context mContext;
    private int mLayoutResId;
    private ArrayList<PreviosImage> mPreviousList;




    public PreviousLottery(Context mContext, int resource, ArrayList<PreviosImage> previosImages) {
        super(mContext, resource , previosImages);

        this.mContext = mContext;
        this.mLayoutResId = resource;
        this.mPreviousList = previosImages;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemLayout = convertView;

        if(itemLayout == null){
            itemLayout = View.inflate(mContext, mLayoutResId, null);
        }

        //ImageView imageView = (ImageView) itemLayout.findViewById(R.id.image);
        TextView nameTextView = (TextView) itemLayout.findViewById(R.id.textViewPrevious);
        TextView tv1 = (TextView) itemLayout.findViewById(R.id.tv1);
        TextView tv2 = (TextView) itemLayout.findViewById(R.id.tv2);
        TextView tv3 = (TextView) itemLayout.findViewById(R.id.tv3);
        TextView tv4 = (TextView) itemLayout.findViewById(R.id.tv4);


        //เข้าถึงออบเจ็ก Contact หนึ่งๆใน mContactList
        PreviosImage previosImage = mPreviousList.get(position);
        nameTextView.setText(previosImage.name);
        tv1.setText(previosImage.reward1);
        tv2.setText(previosImage.f3);
        tv3.setText(previosImage.b3);
        tv4.setText(previosImage.b2);

        /*String previosImageName = previosImage.name;
        nameTextView.setText(previosImageName);
        Drawable drawable = Utils.getDrawableFromAssets(mContext, previosImage.picture);

*/
        return itemLayout;
    }
}

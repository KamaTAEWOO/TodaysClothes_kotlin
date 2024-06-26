package com.kama.presentation.adapter

import android.content.Context
import android.graphics.Color
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kama.core.util.SharedPreferenceHelper
import com.kama.presentation.R
import timber.log.Timber

class AlbumAddAdapter(
    private val context: Context,
    private val sharedPreferenceFile: String,
    private val albumImageList: MutableList<Uri>
) : RecyclerView.Adapter<AlbumAddAdapter.ImageButtonViewHolder>() {

    class ImageButtonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageButton: ImageButton = itemView.findViewById(R.id.ib_image_add)
    }

    private val TAG = "MyClosetFragment::"
    private var listener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageButtonViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image_button, parent, false)
        return ImageButtonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ImageButtonViewHolder, position: Int) {
        val currentItem = albumImageList[position]

        holder.imageButton.setOnClickListener {
            Timber.d("$TAG::onBindViewHolder() position: $position")
            listener?.onItemClick(currentItem, position)
        }

        // TODO: Glide 로드 시 캐시 삭제 처리 추후에 해주기
        Glide.with(context)
            .load(currentItem)
            .into(holder.imageButton)

        // 이미지뷰의 스케일 타입 설정
        holder.imageButton.scaleType = ImageView.ScaleType.CENTER_CROP
        // 이미지뷰의 배경색 설정 화이트
        holder.imageButton.setBackgroundColor(Color.WHITE)

        // 데이터 저장
        val sharedPreferenceHelper = SharedPreferenceHelper(context, sharedPreferenceFile)
        sharedPreferenceHelper.saveNewImageList(albumImageList, sharedPreferenceFile)
    }

    override fun getItemCount() = albumImageList.size

    interface OnItemClickListener {
        fun onItemClick(imageUri: Uri, position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    fun addItem(imageResource: Uri) {
        albumImageList.add(1, imageResource) // 맨 앞에 아이템 추가
        notifyItemInserted(1)
    }
}

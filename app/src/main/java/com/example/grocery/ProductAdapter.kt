package com.example.grocery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.grocery.data.Product

class ProductAdapter(val products: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>()  {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductAdapter.ProductHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_layout, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ProductHolder, position: Int) {
        val product = products[position]

        holder.itemname.text = product.productName
        holder.itemImage.setImageResource(product.productImage)
        holder.itemPrice.text = product.price.toString()
        holder.itemQuantity.text = product.quantity

    }

    override fun getItemCount() = products.size

    class ProductHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        val itemname: TextView = itemView.findViewById(R.id.productName)
        val itemImage: ImageView = itemView.findViewById(R.id.productImage)
        val itemPrice: TextView = itemView.findViewById(R.id.price)
        val itemQuantity: TextView = itemView.findViewById(R.id.quantity)


        private var view: View = v
        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }
    }
}


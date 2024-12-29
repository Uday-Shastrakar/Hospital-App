import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hospital.mediroom.R

class ScheduledQueueAdapter(private val scheduledQueueData: List<String>) :
    RecyclerView.Adapter<ScheduledQueueAdapter.ScheduledQueueViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduledQueueViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.scheduled_queue_item, parent, false)
        return ScheduledQueueViewHolder(view)
    }

    override fun onBindViewHolder(holder: ScheduledQueueViewHolder, position: Int) {
        val visit = scheduledQueueData[position]
        holder.visitTextView.text = visit
    }

    override fun getItemCount(): Int {
        return scheduledQueueData.size
    }

    inner class ScheduledQueueViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val visitTextView: TextView = itemView.findViewById(R.id.visitTextView)
    }
}

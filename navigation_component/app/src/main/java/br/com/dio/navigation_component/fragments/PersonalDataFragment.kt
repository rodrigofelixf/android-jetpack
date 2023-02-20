package br.com.dio.navigation_component.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.dio.navigation_component.PersonModel
import br.com.dio.navigation_component.databinding.FragmentPersonalDataBinding
import br.com.dio.navigation_component.extensions.text

class PersonalDataFragment : Fragment() {

    private var _binding: FragmentPersonalDataBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        _binding = FragmentPersonalDataBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonText.setOnClickListener {
            var model = PersonModel(
                name = binding.tilName.text,
                age = binding.tilAge.text.toInt()
            )
            //TODO mandar os dados para outro fragment
            //TODO navegar entre os fragments
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
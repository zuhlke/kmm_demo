//
//  ContentView.swift
//  iOSHost
//
//  Created by Quintin John Balsdon on 11/06/2021.
//

import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        Text("Hello, world!")
            .padding()
        Text(Platform().platform)
            .padding()
        Text(Dice().version)
            .padding()
        Text("\(Dice().invoke(max: 6))")
            .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

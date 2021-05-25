import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaTransportistalistadopedidos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 95%; height: 95%; align-self: center; align-items: center; justify-content: center; background-color:grey; margin: var(--lumo-space-s); padding: var(--lumo-space-s);">
  <vaadin-text-field placeholder="Search" id="inputBusqueda" style="background-color:white">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-vertical-layout theme="spacing" id="containerPedido" style="align-self: center; width: 80%; height: 90%;background-color:white"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-transportistalistadopedidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaTransportistalistadopedidos.is, VistaTransportistalistadopedidos);

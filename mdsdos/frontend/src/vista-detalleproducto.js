import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class VistaDetalleproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 80%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; padding: var(--lumo-space-l); height: 15%;">
    <label style="font-weight: bold; align-self: stretch; ">Título del producto</label>
    <label style="align-self: stretch;">Valoración media: {1}/{2}</label>
   </vaadin-vertical-layout>
   <img style="border: solid; height: 70%; width: 95%; align-self: center;">
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; flex-grow: 0; flex-shrink: 1;">
  <vaadin-vertical-layout theme="spacing" style="width: 90%; padding: var(--lumo-space-l); flex-shrink: 0; height: 15%; align-self: center;">
   <label style="font-weight: bold; align-self: stretch;">Descripción del producto</label>
   <label style="align-self: stretch; font-size: 13px; flex-grow: 0;">Lorem ipsum dolor sit amet, consectetur adipiscing elit , sed eiusmod tempor incidunt ut labore et dolore magna aliqua.usmod tempor incidunt ut labore et dolore magna aliqua.</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 90%; height: 55%; border:solid; align-self: center; padding: var(--lumo-space-m);">
   <label style="font-weight: bold; align-self: stretch;">Carácteristicas</label>
   <vaadin-text-area style="align-self: stretch; width: 100%; height: 100%;"></vaadin-text-area>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 90%; padding: var(--lumo-space-l); height: 25%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <vaadin-button style="width: 50%; align-self: flex-start;">
      Modificar 
    </vaadin-button>
    <vaadin-button style="width: 50%;">
      Ver comentarios 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <label style="width: 50%; align-self: flex-start;">{Precio} €</label>
    <vaadin-button style="margin-top: var(--lumo-space-l); width: 50%; align-self: flex-start;">
      Quitar ofertas 
    </vaadin-button>
    <vaadin-button style="width: 50%;">
      Añadir a Ofertas 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-detalleproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDetalleproducto.is, VistaDetalleproducto);
